// Copyright 2023 Citra Emulator Project
// Licensed under GPLv2 or any later version
// Refer to the license.txt file included.

package io.github.lime3ds.lime3ds.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import io.github.lime3ds.lime3ds.R
import io.github.lime3ds.lime3ds.features.settings.ui.SettingsActivity

class ResetSettingsDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val settingsActivity = requireActivity() as SettingsActivity

        return MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.reset_all_settings)
            .setMessage(R.string.reset_all_settings_description)
            .setPositiveButton(android.R.string.ok) { _, _ ->
                settingsActivity.onSettingsReset()
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    companion object {
        const val TAG = "ResetSettingsDialogFragment"
    }
}
