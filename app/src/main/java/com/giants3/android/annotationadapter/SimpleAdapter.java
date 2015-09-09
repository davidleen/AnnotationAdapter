package com.giants3.android.annotationadapter;

import android.content.Context;
import android.widget.TextView;


import com.giants3.android.annotatableadapter.AbstractAdapter;
import com.giants3.android.annotatableadapter.ResId;
import com.giants3.android.annotatableadapter.UnMixable;

import java.util.List;

/**
 * a sample adapter without multi viewType
 * just ignore the param itemViewType;
 * 
 * @author davidleen29
 * @创建时间 2013年11月14日
 */
public class SimpleAdapter extends AbstractAdapter<Card> {

	public SimpleAdapter(Context context) {
		super(context);

	}

	public SimpleAdapter(Context context, List<Card> cards) {
		super(context, cards);

	}



	@Override
	protected UnMixable createViewHolder(int itemViewType) {
		return new  NumberTypeBinder() ;
	}

	/**
	 * @author davidleen29
	 * @创建时间 2013年11月14日
	 * this class must annotate with layout id
	 */
   @ResId(R.layout.list_item_number_type)
	public static class NumberTypeBinder implements Bindable<Card> {

		public NumberTypeBinder() {
		}

		//annotate with viewId
		@ResId(R.id.cardType)
		TextView cardType;
		//more can define below
		@Override
		public void bindData(AbstractAdapter<Card> adapter,Card data, int position) {
			// here do all your bind obj
			cardType.setText(data.toString());

			//more bind works....
		}

	}

}
