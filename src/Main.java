public class Main {
    public static void main(String[] args) {
        int roomPerimeter = 30;
        int roomHeight = 3;
        int wallpaperLength = 10;
        int wallpaperWidth = 1;
        int cloth = roomPerimeter/wallpaperWidth;
        int oneRoll = wallpaperLength/roomHeight;
        int rollsNeed = cloth/oneRoll;
        System.out.println(rollsNeed);
    }
}
