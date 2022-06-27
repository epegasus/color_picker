

package dev.pegasus.colorpickerview.flags;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.ImageViewCompat;
import dev.pegasus.colorpickerview.ColorEnvelope;
import com.skydoves.colorpickerview.R;

/** BubbleFlag is a supported {@link FlagView} by the library. */
public class BubbleFlag extends FlagView {

  private AppCompatImageView bubble;

  public BubbleFlag(Context context) {
    super(context, R.layout.flag_bubble_colorpickerview_skydoves);
    this.bubble = findViewById(R.id.bubble);
  }

  /**
   * invoked when selector is moved.
   *
   * @param colorEnvelope provide hsv color, hexCode, argb
   */
  @Override
  public void onRefresh(ColorEnvelope colorEnvelope) {
    ImageViewCompat.setImageTintList(bubble, ColorStateList.valueOf(colorEnvelope.getColor()));
  }
}
