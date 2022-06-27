package dev.pegasus.colorpickerview;

import dev.pegasus.colorpickerview.listeners.ColorPickerViewListener;

/**
 * ActionMode controls an action about {@link
 * ColorPickerViewListener} invoking.
 */
public enum ActionMode {
    /**
     * invokes listener always by tapping or dragging.
     */
    ALWAYS,

    /**
     * invokes listener only when finger released.
     */
    LAST
}
