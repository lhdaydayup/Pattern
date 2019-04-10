package abstuctFactoryPattern.factory;

import abstuctFactoryPattern.product.InterfaceController;
import abstuctFactoryPattern.product.OperationController;
import abstuctFactoryPattern.product.SymbainInterfaceController;
import abstuctFactoryPattern.product.SymbianOperationController;

public class SymbianFactory extends GameControlloerFactory {
    @Override
    public InterfaceController createInterface() {
        return new SymbainInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new SymbianOperationController();
    }
}
