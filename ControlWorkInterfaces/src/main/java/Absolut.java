public abstract class Absolut implements Intface {
    /**
     * Метод Find определяет, находится ли среди объектов машина заданного года выпуска:
     *      Пусть изначально задан год, равным -1 (это необходимо, чтобы, если машина с необходимым годом не нашлась, вывелось отрицательное значение)
     * @param cars отвечает за машины
     * @param count - количество машин
     * @param necessaryYear - необходимый год
     * @return year - возвращает необходимый год
     */
    public int Find(Basovi[] cars, int count, int necessaryYear) {
        int year = -1;
        for (int i = 0; i < count; i++) {
            if (cars[i] instanceof Avto && ((Avto) cars[i]).getGod() == necessaryYear) {
                year = necessaryYear;
                System.out.println(cars[i]);
            }
        }
        return year;
    }
}