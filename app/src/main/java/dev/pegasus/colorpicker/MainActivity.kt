package dev.pegasus.colorpicker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import dev.pegasus.colorpickerview.ColorEnvelope
import dev.pegasus.colorpickerview.flags.BubbleFlag
import dev.pegasus.colorpickerview.flags.FlagMode
import dev.pegasus.colorpickerview.listeners.ColorEnvelopeListener
import dev.pegasus.colorpicker.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setUI()
    }

    private fun setUI() {
        val bubbleFlag = BubbleFlag(this)
        bubbleFlag.flagMode = FlagMode.ALWAYS
        binding.cpvContainerMain.flagView = bubbleFlag
        binding.cpvContainerMain.setColorListener(ColorEnvelopeListener { envelope: ColorEnvelope, _: Boolean ->
            setLayoutColor(envelope)
        })
        binding.cpvContainerMain.setLifecycleOwner(this)
        binding.cpvContainerMain.setPaletteDrawable(ContextCompat.getDrawable(this, R.drawable.img_dummy))
    }

    private fun setLayoutColor(envelope: ColorEnvelope) {
        binding.tvColorCodeMain.text = String.format(Locale.getDefault(), "#${envelope.hexCode}")
        binding.view1Main.setBackgroundColor(envelope.color)
    }
}