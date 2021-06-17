package Sale;

public class SaleMachine {

        private int fiveNum,orangeNum,beerNum;

        private String[] type={"beer","orange"};

        private String[] answer={"很抱歉，没有","请取走","拿好5元，请取走","没有零钱找，退您10元","错误指令!"};


        public SaleMachine(){
        orangeNum=5;

         beerNum=5;

        fiveNum=0;

        }


         public String sale(String drink,int money){

            String result=null;

            if(beerNum<1&&drink.equals(type[0])||orangeNum<1&&drink.equals(type[1])){

                result=answer[0]+drink;

            }else if (money==5){

                fiveNum++;

                result=answer[1]+drink;

                if(drink.equals(type[0])){

                    beerNum--;

                }else if (drink.equals(type[1])){

                    orangeNum--;

                }else

                    result=answer[4];

                }else if (money==10){

                  if (fiveNum<1){

                     result=answer[3];

                }else {

                    fiveNum--;



                     if (drink.equals(type[0])){

                         beerNum--;
                         result=answer[1]+drink;

                    }else if (drink.equals(type[1])){
                        orangeNum--;
                         result=answer[1]+drink;

                    }
                     else {
                         result=answer[4];
                     }

                 }



            }

        return result;

        }


}