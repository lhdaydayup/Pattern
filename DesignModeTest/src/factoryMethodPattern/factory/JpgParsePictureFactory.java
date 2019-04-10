package factoryMethodPattern.factory;

import factoryMethodPattern.product.JpgParsePictureUtil;
import factoryMethodPattern.product.ParsePictureUtil;

public class JpgParsePictureFactory extends ParsePictureUtilFactory {
    @Override
    public ParsePictureUtil createParsePictureUtil() {
        return new JpgParsePictureUtil();
    }
}
