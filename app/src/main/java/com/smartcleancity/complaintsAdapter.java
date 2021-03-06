package com.smartcleancity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;
public class complaintsAdapter extends BaseExpandableListAdapter{

    Context context;
    List<String> states;
    Map<String, List<String>> cities;

    public complaintsAdapter(Context context, List<String> states, Map<String, List<String>> cities) {
        this.context = context;
        this.states = states;
        this.cities = cities;
    }

    @Override
    public int getGroupCount() {
         return states.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return cities.get(states.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return states.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return cities.get(states.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String states = (String) getGroup(groupPosition);
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.complaints_parent, null);

        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.showWorkParent);
        txtParent.setText(states);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String cities = (String) getChild(groupPosition,childPosition);

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.complaints_child,null);

        }

        TextView txtChild = (TextView) convertView.findViewById(R.id.showWorkChild);
        txtChild.setText(cities);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
