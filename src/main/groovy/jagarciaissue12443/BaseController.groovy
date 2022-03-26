package jagarciaissue12443

abstract class BaseController {
    def terms() {
        render view: '/legal/terms'
    }
}
