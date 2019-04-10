package BuildPattern;

public class WangzhengModeBuild extends ModeBuild {
    @Override
    void buildCaidan() {
        mode.setCaidang("A-Caidang");
    }

    @Override
    void buildBofanglibiao() {
        mode.setBofanglibiao("A-liebiao");
    }

    @Override
    void buildZhuchuangkou() {
        mode.setZhuchuangkou("A-zhu");
    }

    @Override
    void buildKongzhitiaol() {
        mode.setKongzhitiaol("A-Kongzhitiao");
    }

    @Override
    void buildShouchangliebiao() {
        mode.setShouchangliebiao("A-Shouchuang");
    }
}
