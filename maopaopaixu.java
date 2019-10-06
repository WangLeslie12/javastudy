public class maopaopaixu {
    public static void main(String[] args) {
        maopao();
    }
    //ctrl+alt+M重构方法快捷键
    private static void maopao() {
        int n;
        int temp;
        int[]a=new int[n];
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
