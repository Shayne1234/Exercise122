package com.company;



    enum TrafficLightColor{
        RED,GREEN,ORANGE
    }

    class TrafficLight{
        TrafficLightColor tc= TrafficLightColor.RED;

        public void ChangeColor(){
            switch (tc){
                case RED:
                    tc= TrafficLightColor.GREEN;
                    break;

                case ORANGE:
                    tc=TrafficLightColor.RED;
                    break;

                case GREEN:
                    tc= TrafficLightColor.ORANGE;
                    break;
            }
        }

        public String toString(){return " "+ tc;}
    }

    public class Task2 {
        public static void main(String[] args) {
            TrafficLight t= new TrafficLight();
            for(int i=0;i < 9; i++){
                System.out.println(t);
                t.ChangeColor();
            }

        }
    }

