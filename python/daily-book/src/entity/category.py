class Category:
    id = ''
    name = ''
    nature = ''
    parent_id = ''
    create_time = None
    update_time = None

    def __init__(self, name, nature, parent_id):
        self.name = name
        self.nature = nature
        self.parent_id = parent_id