public class Main {
    public static void main(String[] args) {
        double roomPerimeter = 29;
        double roomHeight = 3;
        double wallpaperLength = 10;
        double wallpaperWidth = 1;
        double cloth = roomPerimeter/wallpaperWidth;
        double oneRoll = wallpaperLength/roomHeight;
        double rollsNeed = cloth/oneRoll;
        int rollsNeedRounded = (int) Math.round(rollsNeed);
        System.out.println(cloth);
        System.out.println(oneRoll);
        System.out.println(rollsNeedRounded);
    }
}
