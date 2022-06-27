package dev.pegasus.colorpickerview.listeners;

import dev.pegasus.colorpickerview.ColorEnvelope;
import dev.pegasus.colorpickerview.ColorPickerView;

/**
 * ColorEnvelopeListener is invoked whenever {@link ColorPickerView} is
 * triggered.
 */
public interface ColorEnvelopeListener extends ColorPickerViewListener {
    /**
     * invoked by {@link ColorPickerView}.
     *
     * @param envelope {@link ColorEnvelope}
     * @param fromUser triggered by the user(true) or not(false).
     */
    void onColorSelected(ColorEnvelope envelope, boolean fromUser);
}
