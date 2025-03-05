public class shortestPath {
    public static void main(String[] args) {
        String path = "NS";
        int x=0,y=0;
        for(int i =0; i<path.length(); i++){
            if(path.charAt(i)=='E'){
                x++;
            }
            if(path.charAt(i)=='W'){
                x--;
            }
            if(path.charAt(i)=='N'){
                y++;
            }
            if(path.charAt(i)=='S'){
                y--;
            }
        }
        float shortPath = (float)Math.sqrt((x*x)+(y*y));
        System.out.println(shortPath);
    }
}
