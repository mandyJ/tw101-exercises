package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left = null;
    private Node right = null;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {

        int relation = name.compareTo(nameOfNewNode);

        if(relation > 0){
            if(left == null) {
                left = new Node(nameOfNewNode);
                return;
            } else
                left.add(nameOfNewNode);
        }else if(relation < 0){
            if(right == null) {
                right = new Node(nameOfNewNode);
                return;
            } else
                right.add(nameOfNewNode);
        }

        return;
    }

    public List<String> names() {
        List<String> abcList = new ArrayList<>();

        if(left!=null)
           abcList = mergeLists(left.names(),abcList);

        abcList.add(name);

        if(right!=null)
            abcList = mergeLists(abcList,right.names());

        return abcList;
    }

    static private List<String> mergeLists(List<String> leftList, List<String> rightList){

        List<String> temp = new ArrayList<String>();
        for(String item :leftList)
            temp.add(item);
        for(String item :rightList)
            temp.add(item);

        return temp;
    }
}
