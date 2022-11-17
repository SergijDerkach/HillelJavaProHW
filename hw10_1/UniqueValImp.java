package hw10_1;

import java.util.ArrayList;

public class UniqueValImp implements UniqueVal{
    private ArrayList<Object> temp = new ArrayList<Object>();
    private Object obTemp;
    @Override
    public Object retUnval(ArrayList<Object> objects) {
        for(int i = 0; i<objects.size();i++){
            for(int j=0;j<objects.size();j++){
                if(objects.get(i)!=objects.get(j)){
                    if(temp.size() == 0){
                        temp.add(j);
                        break;
                    }else {
                        if(temp.contains(objects.get(i))){
                            break;
                        }else temp.add(objects.get(i));
                    }
                }
            }
        }

        return temp;
    }
}
