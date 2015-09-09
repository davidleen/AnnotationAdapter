# AnnotationAdapter
a helper to reduce the code in creating android adapter


/**
 * a sample adapter 
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
	 */
   @ResId(R.layout.list_item_number_type)
	public static class NumberTypeBinder implements Bindable<Card> {

		public NumberTypeBinder() {
		} 

		@ResId(R.id.cardType)
		TextView cardType;

		@Override
		public void bindData(AbstractAdapter<Card> adapter,Card data, int position) {
			// here do all your bind obj
			cardType.setText(data.toString());
		}

	}

}
