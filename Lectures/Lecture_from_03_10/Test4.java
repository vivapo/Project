public class Test4 {
    public static void main(String[] args){
        String R = "\u2588";
        System.out.println();
        int[][] colors = {
                {0xFF5023,0x00CC12,0x90DE12},
                {0x40FF77,0xBBCC12,0x90DB72},
                {0xFFCC23,0xC0CC12,0x9CCD12}};
        for(int i = 0;i < colors.length;++i){
            for (int j = 0; j < colors[i].length;++j){
                int c = colors[i][j];
                int r = c>>16;
                int g = (c>>8)&(0xFF);
                int b = c&(0xFF);
                System.out.print("\u001B[38;2;"+r+";"+g+";"+b+"m"+R);
            }
            System.out.println();
        }

    }

}
