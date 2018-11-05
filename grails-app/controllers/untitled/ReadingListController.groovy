package untitled

import org.springframework.transaction.annotation.Transactional

class ReadingListController {

    def index() {}

    @Transactional
    def save(Book book) {
        book.reader = "Craig"
        book.save flush: true
        redirect(action: "index")
    }
}
