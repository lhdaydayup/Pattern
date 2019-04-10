package factoryMethodPattern.factory;

import factoryMethodPattern.product.ParsePictureUtil;

public abstract class ParsePictureUtilFactory {
    public abstract ParsePictureUtil createParsePictureUtil();
}
