package com.smartcleancity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class showWorkAdapter extends BaseExpandableListAdapter {

    Context context;
    List<String> name;
    Map<String, List<String>> subject;

    public showWorkAdapter(Context context, List<String> name, Map<String, List<String>> subject) {
        this.context = context;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public int getGroupCount() {
        return name.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return subject.get(name.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return name.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return subject.get(name.get(groupPosition)).get(childPosition);
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
        String name = (String) getGroup(groupPosition);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.showwork_parent,null);

        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.showWorkParent);
        txtParent.setText(name);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String subject = (String) getChild(groupPosition,childPosition);

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.showwork_child,null);

        }

        TextView txtChild = (TextView) convertView.findViewById(R.id.showWorkChild);
        txtChild.setText(subject);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
