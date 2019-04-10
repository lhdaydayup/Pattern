package CombinationPattern;

// 组合模式：把容器和子容器以及叶子当作同一个对象
public class Client {
    public static void main(String[] args){
        File rootfile =new File("根文件");
        File fil1 =new File("1");
        File fil2 =new File("2");
        ImageFile imageFile=new ImageFile("图片1");
        ImageFile imageFile1=new ImageFile("图片2");
        TxtFile txtFile=new TxtFile("文件1");
        TxtFile txtFile1=new TxtFile("文件2");
        TxtFile txtFile2=new TxtFile("文件3");

        rootfile.addComponent(fil1);
        rootfile.addComponent(fil2);
        fil1.addComponent(txtFile2);
        fil1.addComponent(imageFile);
        fil1.addComponent(imageFile);
        fil1.addComponent(txtFile);
        fil2.addComponent(txtFile1);
        fil2.addComponent(txtFile2);
        rootfile.operation();
    }
}
