import rm.controller.*
import rm.domain.*
import rm.repository.*
import rm.service.*

description 'User can view a reference entry'

scenario "user can view a reference entry they have just added", {
    given 'a new entry is added'
    when 'user attempts to view an entry'
    then 'reference entry is displayed to the user'
}

scenario "user can not view any references when there are none", {
    given 'there are no references in the database'
    when 'user attempts to view an entry'
    then 'no reference entry is displayed'
}

scenario "user will see all the fields of their entry", {
    given 'a new entry is added'
    when 'user attempts to view an entry'
    then 'all fields of the entry are displayed'
}


