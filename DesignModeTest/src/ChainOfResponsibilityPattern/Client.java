package ChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args){
        Person zr,gm,tgm,zz,bigZZ;
        tgm=new TGM();
        gm=new GM();
        zr=new ZR();
        zz=new ZZ();
        bigZZ=new BIGZZ();
        gm.setPerson(tgm);
        zr.setPerson(gm);
        bigZZ.setPerson(zr);
        zz.setPerson(bigZZ);

        zz.approve(40);
    }
}
