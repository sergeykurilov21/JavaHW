
    public class HW2 {
        public static void main(String[] args) {
            int countInRow = 15;
            int n = 1;// переменная из формулы
            int maxNum = 1000;// число-предел значений
            int countNumbers; //счетчик значений, по достижении значения countInRow
            // переводит строку в выводе
            String resNumStr; // строка с форматированными значениями
            int resNum; //результат вычислений по формуле 6n(±)1
            int k = -1;//эквивалент единицы в формуле,
            //умножается на -1 после каждого вычисления
    
            resNumStr = String.format("%4d", 1) + " ";
            resNumStr += String.format("%4d", 2) + " ";
            resNumStr += String.format("%4d", 3) + " ";
            resNumStr += String.format("%4d", 5) + " ";
            System.out.printf(resNumStr);
            countNumbers = 4;
            // цикл продолжается пока результат не достигнет максимально
            // заданного значения
            while ((6 * n) + k < maxNum) {
                k = k * -1;
                resNum = (6 * n - k);
                // удаление результатов, кратных пяти
                if ((resNum % 5) != 0) {
                    resNumStr = String.format("%4d", resNum) + " ";
                    countNumbers += 1;
                    System.out.printf(resNumStr);
                    // разбиение по строкам по достижении заданного количества чисел в строке
                    if (countNumbers == countInRow) {
                        System.out.println();
                        countNumbers = 0;
                    }
                }
                // увеличение значения переменной в формуле после 
                // 6n + 1
                if (k < 0) {
                    n += 1;
                }
    
            }
    
        }
    
    }

