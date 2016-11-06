package com.jaiky.test.faceview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class FaceAdapter extends BaseAdapter {

	private Context m_Context;
	private int facepage_num;
	private int face_num;
	private final int FACE_COUNT = 21;

	public FaceAdapter(Context context, int facepage_num) {
		m_Context = context;
		this.facepage_num = facepage_num;
	}

	@Override
	public int getCount() {
		return FACE_COUNT;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (null == convertView) {
			convertView = LayoutInflater.from(m_Context).inflate(
					R.layout.global_face_item, parent, false);

			holder = new ViewHolder();
			holder.m_imgFace = (ImageView) convertView
					.findViewById(R.id.facelistitem_imgFace);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		face_num = (facepage_num - 1) * FACE_COUNT + position;
		holder.m_imgFace.setImageResource(FaceManager.getInstance().getFace(face_num));
		holder.m_imgFace.setTag(face_num);

		return convertView;
	}

	class ViewHolder {
		public ImageView m_imgFace;
	}
}
