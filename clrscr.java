//ใส่ไว้ต่อท้าย Main ใน Class Calling
// เวลาเรียกใช้ clear screen ให้ใส่ clrscr(); ใน Main ตรงตำแหน่งที่ต้องการให้ clear screen
public static void clrscr(){
//Clears Screen in java
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
}