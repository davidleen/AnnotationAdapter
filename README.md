# AnnotationAdapter
a helper to reduce the code in creating android adapter


 
<code>
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
	 * this class must annotate with layoutId 
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
 


</code>


this simple adapter  let you focus on the view And Data bindwork。

no findview  no getTag now

adapter for multitype is similar. 

just define some Bindable class ,and return them according to itemViewType


how to use it:

<code>

//repository

repositories {
        jcenter()
    }
    
    
    
    
    // add  dependency
     compile 'com.giants3.android:annotatableadapter:1.0'

</code>


ps: this class use annotation,so it will cause some problem about proguard .

add the lines below to  proguard-project.txt will help.

<code>

  -keep interface com.nd.hairdressing.UnMixable
  
 -keepclassmembernames class * implements com.nd.hairdressing.UnMixable
 {
	*;
 }
 
</code>



