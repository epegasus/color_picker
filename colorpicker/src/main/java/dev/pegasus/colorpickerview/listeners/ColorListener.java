package dev.pegasus.colorpickerview.listeners;

import androidx.annotation.ColorInt;

import dev.pegasus.colorpickerview.ColorPickerView;

/**
 * ColorListener is invoked whenever {@link ColorPickerView} is
 * triggered.
 */
public interface ColorListener extends ColorPickerViewListener {
    /**
     * invoked by {@link ColorPickerView}.
     *
     * @param color    the last selected color.
     * @param fromUser triggered by the user(true) or not(false).
     */
    void onColorSelected(@ColorInt int color, boolean fromUser);
}
