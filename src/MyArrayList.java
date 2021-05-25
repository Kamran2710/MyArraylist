public class MyArrayList implements MyList {

    private Integer limit = 10;
    private String [] array = new String[limit];
    private Integer index = 0;


    @Override
    public void add(String s) {
        if(index < limit-1){
            array[index++] = s;
        } /*else {
            limit = limit+10;
            String [] array1 = new String[limit];
            for(int i =0; i <array.length; i++){
                for(int j=0; j<array1.length; j++){
                    array1[j]=array[i];
                    array1[j++]=s;
                }
            }
        }*/

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
    }

    @Override
    public void remove(Integer i) {
        for(int j=0; j<array.length;j++){
            if (j==i){
                array[j]=null;
                for(int k=j; k<array.length; k++){ // arrayin null olan indexine ondan sonraki indexdeki deyerleri
                    for(int n=j+1; n< array.length; n++){ //iterasiya edib surusdurmek istedim
                        array[k]=array[j+1];
                    }
                }

            }
        }
    }

    @Override
    public void addAll(MyList list) {
//        if(list.length>=MyList.list.length)

    }

    @Override
    public Integer size() {
        int k = 0;
       for(int i = 0; i<array.length; i++){
           k++;
       }
       return k;
    }

    @Override
    public boolean isEmpty() {
        if(array.length==0){
            return true;
        }else
            return false;

    }

    @Override
    public int Clear() {
        for(int i = 0; i<array.length; i++){
            array[i]=null;
        }
        return array.length- array.length; //uzunlugu yene 10 gosterirdi deye bele etdim :)
    }

    @Override
    public String get(Integer i) {
        int j;
        for( j=0; j< array.length; j++){
            if(j==i){
                break;
            }
        }
        return array[j];
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            result.append(array[i])
                    .append(" , ");
        }
        result.append("]");
        return result.toString();
    }
}
