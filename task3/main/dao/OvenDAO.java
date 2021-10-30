package com.task3.main.dao;

import com.task3.main.model.Applianced;
import com.task3.main.model.criteria.Criteria;

import java.util.ArrayList;

public class OvenDAO implements ApplianceDAO {
    //сюда должны передать общий лист
    ArrayList<ArrayList<Applianced>> list;

    public OvenDAO(ArrayList<ArrayList<Applianced>> list) {
        this.list = list;
    }



    @Override
    public Applianced find(Criteria criteria) {
        //заглушка. тут мы должны искать по критериям и вернуть объект oven

 //       if(criteria.getGroupSearchName()=="Ovens") {
//            for((Oven)Applianced currentClass:list.get(0)){
        //здесь как-то должны сравнивать параметры  и вернуть найденый класс ,
        // но так как currentClass временный при итерации ,мы должны присвоить его другому объекту,
        // наверное типа так

//               String key=criteria.getCriteriaMap.getKey()-нужно перевести в стринг
//               String value=criteria.getCriteriaMap.getValue(); -то же самое
//               Switch(key):
//                   case(powerConsumption){
//                      if(currentClass.getPowerConsumption.value==0);
//                      return Oven myDearOven=currentClass;

//                      break; }
//                   case(weight) {
//                      .....
//                      break;}
//                    и так по каждому параметру, may be
//                ){
//                    System.out.println();
//                }
//            }
//        }

        return null;

        }
    // можно еще реализовать метод, чтобы добавлять  ovens


    }

