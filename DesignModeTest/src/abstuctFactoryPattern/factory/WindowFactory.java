package abstuctFactoryPattern.factory;

import abstuctFactoryPattern.product.InterfaceController;
import abstuctFactoryPattern.product.OperationController;
import abstuctFactoryPattern.product.WindowInterfaceControlloer;
import abstuctFactoryPattern.product.WindowOperationController;

public class WindowFactory extends GameControlloerFactory {
    @Override
    public InterfaceController createInterface() {
        return new WindowInterfaceControlloer();
    }

    @Override
    public OperationController createOperation() {
        return new WindowOperationController();
    }
}
