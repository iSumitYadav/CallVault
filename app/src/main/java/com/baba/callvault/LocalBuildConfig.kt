package com.baba.callvault

/**
 * Features deliberately disabled in this private, local-only build.
 *
 * Keep these switches together so a future change is deliberate
 * and easy to audit.
 */
object LocalBuildConfig {
    const val ENABLE_IN_APP_UPDATER = false
    const val ENABLE_CLOUD_TRANSCRIPTION = false
    const val ENABLE_MODEL_DOWNLOADS = false
    const val ENABLE_DRIVE_SYNC = false
}