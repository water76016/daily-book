class Bill:
    id = ''
    account_book_id = ''
    category_id = ''
    cost = 0
    remark = ''
    create_time = None
    update_time = None

    def __init__(self, account_book_id, category_id, cost, remark, create_time, update_time):
        self.account_book_id = account_book_id
        self.category_id = category_id
        self.cost = cost
        self.remark = remark
        self.create_time = create_time
        self.update_time = update_time