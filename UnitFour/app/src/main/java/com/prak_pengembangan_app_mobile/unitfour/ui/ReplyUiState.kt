package com.prak_pengembangan_app_mobile.unitfour.ui

import com.prak_pengembangan_app_mobile.unitfour.data.Email
import com.prak_pengembangan_app_mobile.unitfour.data.MailboxType
import com.prak_pengembangan_app_mobile.unitfour.data.local.LocalEmailsDataProvider

data class ReplyUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}
