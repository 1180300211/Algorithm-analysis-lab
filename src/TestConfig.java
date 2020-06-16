public class TestConfig {




    //数据集大小
    public static int size =10;
    //数据集长度
    public static int len =20;

    public static int getSize(){
        return size*10000;
    }

    //文件名称
    public static String fileName="Corpus"+ size +"W"+len+".txt";

    public static String getFileName(){
        return fileName;
    }

}
