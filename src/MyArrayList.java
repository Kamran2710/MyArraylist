public class MyArrayList implements MyList {

    private Integer limit = 10;
    private String[] array = new String[limit];
    private Integer index = 0;


    @Override
    public void add(String s) {
        if (indexOf(s) == -1) {
            if (index < limit) {
                array[index++] = s;
            } else {
                limit = limit + 10;
                String[] array1 = new String[limit];
                for (int i = 0; i < array.length; i++) {
                    array1[i] = array[i];
                }
                array = array1;
                array[index++] = s;
            }
        }
    }

    @Override
    public void remove(String s) {
//        for(int j=0; j<array.length;j++){
//            if (j==){
//                array[j]=null;
//                for(int k=j; k<array.length; k++){ // arrayin null olan indexine ondan sonraki indexdeki deyerleri
//                    for(int n=j+1; n< array.length; n++){ //iterasiya edib surusdurmek istedim
//                        array[k]=array[j+1];
//                    }
//                }
//
//            }
//        }
        int indexToDelete = -1;
        for (int i = 0; i < index; i++) {
            if (array[i].equals(s)) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete != -1) {
            String[] newArray = new String[limit];
            int j = 0;
//            for (int i = 0; i < indexToDelete; i++) {//sol
//                newArray[j++] = array[i];
//            }
//            for (int i = indexToDelete + 1; i < index; i++) {//sag
//                newArray[j++] = array[i];
//            }

            for (int i = 0; i < index; i++) {
                if (i == indexToDelete) {
                    continue;
                }
                newArray[j++] = array[i];
            }
            index--;
            array = newArray;
        }
    }

    @Override
    public void remove(Integer indexToDelete) {
//        for (int j = 0; j < array.length; j++) {
//            if (j == i) {
//                array[j] = null;
//                for (int k = j; k < array.length; k++) { // arrayin null olan indexine ondan sonraki indexdeki deyerleri
//                    for (int n = j + 1; n < array.length; n++) { //iterasiya edib surusdurmek istedim
//                        array[k] = array[j + 1];
//                    }
//                }
//
//            }
//        }
        String[] newArray = new String[limit];
        int j = 0;
        for (int i = 0; i < index; i++) {
            if (i == indexToDelete) {
                continue;
            }
            newArray[j++] = array[i];
        }
        index--;
        array = newArray;
    }

    @Override
    public void addAll(MyList list) {
//        if(list.length>=MyList.list.length)
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public Integer size() {
//        int k = 0;
//        for (int i = 0; i < array.length; i++) {
//            k++;
//        }
//        return k;
        return index;
    }

    @Override
    public boolean isEmpty() {
//        if (array.length == 0) {
//            return true;
//        } else
//            return false;
        return index == 0;
    }

    @Override
    public void clear() {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = null;
//        }
//        return array.length - array.length; //uzunlugu yene 10 gosterirdi deye bele etdim :)
        limit = 10;
        array = new String[limit];
        index = 0;
    }

    @Override
    public String get(Integer i) {
//        int j;
//        for (j = 0; j < array.length; j++) {
//            if (j == i) {
//                break;
//            }
//        }
        return array[i];
    }

    @Override
    public void set(Integer index, String value) {
        array[index] = value;
    }

    @Override
    public Integer indexOf(String s) {
        int indexOf = -1;
        for (int i = 0; i < index; i++) {
            if (array[i].equals(s)) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            result.append(array[i]);
            if (i < index - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
