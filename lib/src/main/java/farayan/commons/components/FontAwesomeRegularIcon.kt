package farayan.commons.components

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.core.content.res.ResourcesCompat
import farayan.commons.components.font.icon.awesome.regular.R
import java.lang.Exception

class FontAwesomeRegularIcon : FixedResourceFontTextView {

    constructor(@androidx.annotation.NonNull context: Context) : super(context)
    constructor(@androidx.annotation.NonNull context: Context, attrs: AttributeSet?) : super(context, attrs) {
        loadAttrs(attrs)
    }

    constructor(@androidx.annotation.NonNull context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        loadAttrs(attrs, defStyleAttr)
    }


    private fun loadAttrs(attrs: AttributeSet?, defStyleAttr: Int = 0) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FontAwesomeRegularIcon, defStyleAttr, 0)
        try {
            val textCode = typedArray.getInt(R.styleable.FontAwesomeRegularIcon_RegularIcon, 0);
            text = textCode.toChar().toString();
        } finally {
            typedArray.recycle();
        }
    }

    override val inheritedFontResID: Int
        get() = R.font.font_awesome_5_free_regular_400
}
