public class DayTime {
    public String getDay(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }
    public String getTime(String day,float hour){
        if(hour<9 || hour>17){
            return "not learning hours";
        }
        if(day=="Sunday" || day=="Saturday"){
            return "Weekend";
        }
        switch(day){
            case "Monday":
                {
                    if(hour>=9&&hour<=10){
                        return "Maths";
                    }else if(hour>=10&&hour<=11){
                        return "English";
                    }
                    else if(hour>=11 && hour<=11.15){
                        return "Break";
                    }
                    else if(hour>=11.15&&hour<=12){
                        return "Science";
                    }
                    else if(hour>=12&&hour<=13){
                        return "History";
                    }
                    else if(hour>=13&&hour<=14){
                        return "Lunch Break";
                    }
                    else if(hour>=14&&hour<=15){
                        return "Biology";
                    }
                    else if(hour>=15&&hour<=16){
                        return "Chemistry";
                    }
                    else if(hour>=16&&hour<=16.15){
                        return "Break";
                    }
                    else if(hour>=16.15&&hour<=17){
                        return "Physics";
                    }
                }
            case "Tuesday":{
                if(hour>=9&&hour<=10){
                    return "History";
                }else if(hour>=10&&hour<=11){
                    return "Science";
                }
                else if(hour>=11 && hour<=11.15){
                    return "Break";
                }
                else if(hour>=11.15&&hour<=12){
                    return "Maths";
                }
                else if(hour>=12&&hour<=13){
                    return "Biology";
                }
                else if(hour>=13&&hour<=14){
                    return "Lunch Break";
                }
                else if(hour>=14&&hour<=15){
                    return "English";
                }
                else if(hour>=15&&hour<=16){
                    return "Chemistry";
                }
                else if(hour>=16&&hour<=16.15){
                    return "Break";
                }
                else if(hour>=16.15&&hour<=17){
                    return "Physics";
                }
            }
            case "Wednesday":{
                if(hour>=9&&hour<=10){
                    return "English";
                }else if(hour>=10&&hour<=11){
                    return "English";
                }
                else if(hour>=11 && hour<=11.15){
                    return "Break";
                }
                else if(hour>=11.15&&hour<=12){
                    return "Maths";
                }
                else if(hour>=12&&hour<=13){
                    return "Maths";
                }
                else if(hour>=13&&hour<=14){
                    return "Lunch Break";
                }
                else if(hour>=14&&hour<=15){
                    return "Biology";
                }
                else if(hour>=15&&hour<=16){
                    return "Chemistry";
                }
                else if(hour>=16&&hour<=16.15){
                    return "Break";
                }
                else if(hour>=16.15&&hour<=17){
                    return "Physics";
                }
            }
            case "Thursday":{
                if(hour>=9&&hour<=10){
                    return "Physics";
                }else if(hour>=10&&hour<=11){
                    return "Chemistry";
                }
                else if(hour>=11 && hour<=11.15){
                    return "Break";
                }
                else if(hour>=11.15&&hour<=12){
                    return "English";
                }
                else if(hour>=12&&hour<=13){
                    return "History";
                }
                else if(hour>=13&&hour<=14){
                    return "Lunch Break";
                }
                else if(hour>=14&&hour<=15){
                    return "Maths";
                }
                else if(hour>=15&&hour<=16){
                    return "Maths";
                }
                else if(hour>=16&&hour<=16.15){
                    return "Break";
                }
                else if(hour>=16.15&&hour<=17){
                    return "Biology";
                }
            }
            case "Friday":
            {
                if(hour>=9&&hour<=10){
                    return "Maths";
                }else if(hour>=10&&hour<=11){
                    return "English";
                }
                else if(hour>=11 && hour<=11.15){
                    return "Break";
                }
                else if(hour>=11.15&&hour<=12){
                    return "Science";
                }
                else if(hour>=12&&hour<=13){
                    return "History";
                }
                else if(hour>=13&&hour<=14){
                    return "Lunch Break";
                }
                else if(hour>=14&&hour<=15){
                    return "Biology";
                }
                else if(hour>=15&&hour<=16){
                    return "Chemistry";
                }
                else if(hour>=16&&hour<=16.15){
                    return "Break";
                }
                else if(hour>=16.15&&hour<=17){
                    return "Physics";
                }
            }
            default:
                return "Invalid day";
        }
    }

    public String getPeriod(int hour){
        if(hour<12){
            return "AM";
        }else{
            return "PM";
        }
    }

    public static void main(String args[]) {
        DayTime dtObj=new DayTime();
        for (int i = 1; i <= 7; i++) {
            String day=dtObj.getDay(i);
            System.out.println("Day : "+day);
            for(float j=9;j<=17;j++){
                String period=dtObj.getPeriod((int)j);
                String subject=dtObj.getTime(day,j);
                System.out.println("Time : "+j+" "+period+" Subject : "+subject);
            }
        }
    }
}
