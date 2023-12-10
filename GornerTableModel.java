import javax.swing.table.AbstractTableModel;
@SuppressWarnings("serial")
public class GornerTableModel extends AbstractTableModel {
    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;
    public GornerTableModel(Double from, Double to, Double step,
                            Double[] coefficients) {
        this.from = from;
        this.to = to;
        this.step = step;
        this.coefficients = coefficients;
    }
    public Double getFrom() {
        return from;
    }
    public Double getTo() {
        return to;
    }
    public Double getStep() {
        return step;
    }
    public int getColumnCount() {
// В данной модели два столбца
        return 3;
    }
    public int getRowCount() {
// Вычислить количество точек между началом и концом отрезка
// исходя из шага табулирования
        return new Double(Math.ceil((to-from)/step)).intValue()+1;
    }
    public Object getValueAt(int row, int col) {
// Вычислить значение X как НАЧАЛО_ОТРЕЗКА + ШАГ*НОМЕР_СТРОКИ
        double x = from + step*row;
        if(col==2)
        {double result = coefficients[coefficients.length - 1];
            for (int n = coefficients.length - 2; n >= 0; --n) {
                result = coefficients[n] + result * x;
            }
            return (int)result==0;}
        if (col==0) {
// Если запрашивается значение 1-го столбца, то это X
            return x;
        } else {double result = coefficients[coefficients.length - 1];
            for (int n = coefficients.length - 2; n >= 0; --n) {
                result = coefficients[n] + result * x;
            }
// Если запрашивается значение 2-го столбца, то это значение
// многочлена
            //Double result = 0.0;
// Вычисление значения в точке по схеме Горнера.
// Вспомнить 1-ый курс и реализовать
// ...

            return result;
        }
    }
    public String getColumnName(int col) {
        switch (col) {
            case 0:
// Название 1-го столбца
                return "Значение X";
// Название 2-го столбца
            case 2:
                return "Малое число?";
            default:
// Название 3-го столбца
                return "Значение многочлена";
        }
    }

    public Class<?> getColumnClass(int col) {
        if(col==2){return Boolean.class;}
// И в 1-ом и во 2-ом  столбце находятся значения типа Double
        return Double.class;
    }

}
