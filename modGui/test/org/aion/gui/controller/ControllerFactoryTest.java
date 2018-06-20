package org.aion.gui.controller;

import org.aion.gui.controller.partials.ConnectivityStatusController;
import org.aion.gui.controller.partials.PeerCountController;
import org.aion.gui.controller.partials.SyncStatusController;
import org.aion.gui.model.KernelConnection;
import org.aion.os.KernelLauncher;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ControllerFactoryTest {
    private KernelConnection kernelConnection;
    private KernelLauncher kernelLauncher;

    @Before
    public void before() {
        kernelConnection = mock(KernelConnection.class);
        kernelLauncher = mock(KernelLauncher.class);
    }

    @Test
    public void testSettersAndGetters() {
        ControllerFactory unit = new ControllerFactory()
                .withKernelConnection(kernelConnection)
                .withKernelLauncher(kernelLauncher);

        assertThat(unit.getKernelConnection(), is(kernelConnection));
        assertThat(unit.getKernelLauncher(), is(kernelLauncher));
    }

    @Test
    public void testCallForClassWithZeroArgConstructor() {
        ControllerFactory unit = new ControllerFactory()
                .withKernelConnection(kernelConnection)
                .withKernelLauncher(kernelLauncher);
        ZeroArgConstructor result = (ZeroArgConstructor) unit.call(ZeroArgConstructor.class);
        assertThat(result instanceof ZeroArgConstructor, is(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCallForClassWithoutZeroArgConstructor() {
        ControllerFactory unit = new ControllerFactory()
                .withKernelConnection(kernelConnection)
                .withKernelLauncher(kernelLauncher);
        unit.call(NoZeroArgConstructorClass.class);
    }

    @Test
    public void testCallForPredefinedClasses() {
        ControllerFactory unit = new ControllerFactory()
                .withKernelConnection(kernelConnection)
                .withKernelLauncher(kernelLauncher);

        assertThat(unit.call(DashboardController.class) instanceof DashboardController, is(true));
        assertThat(unit.call(SettingsController.class) instanceof SettingsController, is(true));
        assertThat(unit.call(ConnectivityStatusController.class)
                instanceof ConnectivityStatusController, is(true));
        assertThat(unit.call(PeerCountController.class) instanceof PeerCountController, is(true));
        assertThat(unit.call(SyncStatusController.class) instanceof
                SyncStatusController, is(true));
    }
}