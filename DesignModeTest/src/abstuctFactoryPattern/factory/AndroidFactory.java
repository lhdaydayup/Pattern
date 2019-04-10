package abstuctFactoryPattern.factory;

import abstuctFactoryPattern.product.AndroidInterfaceController;
import abstuctFactoryPattern.product.AndroidOperationController;
import abstuctFactoryPattern.product.InterfaceController;
import abstuctFactoryPattern.product.OperationController;

public class AndroidFactory extends GameControlloerFactory {
    @Override
    public InterfaceController createInterface() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new AndroidOperationController();
    }
}
