class Callingtest{
    public static void main(String[] args){
        Test b1 = new Test();

        //onepice
        b1.setVolume1(60);
        b1.setVolume2(60);
        b1.setVolume3(60);
        b1.setVolume4(60);
        b1.setVolume5(60);
        b1.setVolume6(60);
        b1.setVolume7(60);
        b1.setVolume8(60);
        b1.setVolume9(60);
        b1.setVolume10(60);
       
        System.out.println("b1 volume1 is : " + b1.getVolume1());
        System.out.println("b1 volume2 is : " + b1.getVolume2());
        System.out.println("b1 volume3 is : " + b1.getVolume3());
        System.out.println("b1 volume4 is : " + b1.getVolume4());
        System.out.println("b1 volume5 is : " + b1.getVolume5());
        System.out.println("b1 volume6 is : " + b1.getVolume6());
        System.out.println("b1 volume7 is : " + b1.getVolume7());
        System.out.println("b1 volume8 is : " + b1.getVolume8());
        System.out.println("b1 volume9 is : " + b1.getVolume9());
        System.out.println("b1 volume10 is : " + b1.getVolume10());
        System.out.println("");


      
    }
    try{
                                BufferedReader r = new BufferedReader(new FileReader("1_Onepiece.txt"));
                                String s = "";
                                while ((s = r.readLine()) != null) {
                                    String[] data = s.split(",");
                                    float buy1 = Float.parseFloat(data[0]);
                                    float buy2 = Float.parseFloat(data[1]);
                                    float buy3 = Float.parseFloat(data[2]);
                                    float buy4 = Float.parseFloat(data[3]);
                                    float buy5 = Float.parseFloat(data[4]);
                                    float buy6 = Float.parseFloat(data[5]);
                                    float buy7 = Float.parseFloat(data[6]);
                                    float buy8 = Float.parseFloat(data[7]);
                                    float buy9 = Float.parseFloat(data[8]);
                                    float buy10 = Float.parseFloat(data[9]);
                                    
                                }
                                r.close();

                            
                            System.out.printf("Buy : %.2f\n",buy3);
                            
                                    int ans3 = Keyboard.nextInt();
                                    if (ans3 == 1){
                                        break ;
                                    }
                                    else if (ans3 == 0){
                                        return ;
                                    }
                                    else{
                                        System.out.println("");
                                            System.out.println("Please Enter 0 or 1");
                                            return ;
                                    }

                            }
                            catch(FileNotFoundException e){
                                e.printStackTrace();
                            }
                            catch(IOException e){
                        e.printStackTrace();
                    }
}