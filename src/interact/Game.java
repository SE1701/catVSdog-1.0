package interact;

import controller.Controller;
import weapon.Weapon;
import weapon.Wind;

/**
 * @author qanna
 */
public class Game {
    protected Controller controller;
    private String name;
    public static  int  flag=0;
    public static  int  flag2=0;
    public static  int  flag3=0;

    public static int INPUT_ERROR = -1;
    public static int ONE = 0;
    public static int TWO = 1;

    public Game(){
        this.controller = new Controller();

    }

    public boolean round() {
        try{
            Wind wind = controller.generateWind();
            System.out.println("当前风速大小及方向:"+wind.getWindSpeed());

            Weapon wp = controller.getAttacker().getWeaponByPlayer();
            System.out.println("攻击者选择了"+wp.getToolName());

            String result = controller.throwWeapon(wp, wind, controller.getAttacker(), controller.getVictim());
            System.out.println(result);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }



    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    // To be considered twice...
//    public static int verGetWeaponMode(Player player,int mode){
//        Game game=new Game();
//        try{
//            game.getWeaponMode2(player,mode);
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        return flag;
//    }
//    public static int verselectPower(Player player, Wind wind,int power){
//        Game game=new Game();
//        try{
//            game.selectPower2(player,wind,power);
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//        return flag2;
//    }
//    public static  int verGeneratePower(Player player,Wind wind){
//        Game game=new Game();
//        try{
//            game.generatePower(player,wind);
//        }catch(Exception e){
//            System.out.println(e.toString());
//        }
//        return  flag3;
//    }



//    /**
//     * 选择武器
//     * @param player 袭击者
//     */
//    protected void getWeaponMode(Player player){
//        int mode =getWeaponModeInput();
//        while (!(mode== Weapon.POWER_UP || mode==Weapon.ORDINARY)){
//            System.out.println("请输入0或1进行选择");
//            mode = getWeaponModeInput();
//            flag=0;
//        }
//        if (mode == Weapon.POWER_UP){
//            System.out.println("玩家使用了补血工具");
//            flag=1;
//        }
//        else if(mode == Weapon.ORDINARY) {
//            System.out.println("玩家使用了普通攻击工具");
//            flag=2;
//        }
////        controller.initiateWeapon(player,mode);
//    }
//    protected void getWeaponMode2(Player player,int mode){
//        while (!(mode== Weapon.POWER_UP || mode==Weapon.ORDINARY)){
//            System.out.println("请输入0或1进行选择");
//            mode = getWeaponModeInput();
//            flag=0;
//        }
//        if (mode == Weapon.POWER_UP){
//            System.out.println("玩家使用了补血工具");
//            flag=1;
//        }
//        else if(mode == Weapon.ORDINARY) {
//            System.out.println("玩家使用了普通攻击工具");
//            flag=2;
//        }
////        controller.initiateWeapon(player,mode);

//
//    }
//
//    protected int getWeaponModeInput(){
//        int mode = 0;
//        System.out.println("请选择工具   0：补血工具  1：普通武器");
//        Scanner scanner = new Scanner(System.in);
//        try {
//            mode = scanner.nextInt();
//        }
//        catch (Exception e){
//            mode = Weapon.INPUT_ERROR;
//        }
//        return mode;
//    }

//    /**
//     * 自动生成武器
//     * @param player 袭击者
//     */
//    protected void generateWeapon(Player player){
////        System.out.println("0：补血工具  1：普通攻击工具");
////        System.out.println("武器型号：0");
////        controller.initiateWeapon(player,0);
//    }
//
//    /**
//     * @param player 被袭击者
//     * @param wind 风速
//     */
//    public void selectPower(Player player, Wind wind){
//            int power = getPowerInput();
//            while (power == -1 || power < 5 || power >50){
//                System.out.println("请输入5-50以内的整数");
//                power = getPowerInput();
//            }
//
////        boolean isHit= controller.hit(player,power,wind);
////        if(isHit) {
////            System.out.println("击中");
////        }
////        else {
////            System.out.println("未击中");
////        }
//    }
//    public void selectPower2(Player player, Wind wind,int power){
//        //int power = getPowerInput();
//        while (power == -1 || power < 5 || power >50){
//            System.out.println("请输入5-50以内的整数");
//            power = getPowerInput();
//            flag2=0;
//        }

//        boolean isHit= controller.hit(player,power,wind);
//        if(isHit) {
//            System.out.println("击中");
//            flag2=1;
//        }
//        else {
//            System.out.println("未击中");
//            flag2=2;
//        }
//    }
//
//    public int getPowerInput(){
//        int power = -1;
//        System.out.println("请选择发出的力度，数值范围为[5,50]");
//        Scanner scanner = new Scanner(System.in);
//        try {
//            power = scanner.nextInt();
//        }catch (Exception e){
//            power = -1;
//        }
//        return power;
//
//    }

//    /**
//     * 自动生成数值
//     * @param player 被袭击者
//     * @param wind 风速
//     */
//    protected void generatePower(Player player, Wind wind){
//        int power = controller.randomDistance(5,55);
//        System.out.println("生成力度数值为："+power);
////        boolean isHit= controller.hit(player,power,wind);
////        if(isHit) {
////            System.out.println("击中");
////            flag3=0;
////        }
////        else {
////            System.out.println("未击中");
////            flag3=1;
////        }
//    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

}
