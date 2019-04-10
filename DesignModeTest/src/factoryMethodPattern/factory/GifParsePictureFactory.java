package factoryMethodPattern.factory;

import factoryMethodPattern.product.GifParsePictureUtil;
import factoryMethodPattern.product.ParsePictureUtil;

public class GifParsePictureFactory extends ParsePictureUtilFactory {
    @Override
    public ParsePictureUtil createParsePictureUtil() {
        return new GifParsePictureUtil();
    }
}
