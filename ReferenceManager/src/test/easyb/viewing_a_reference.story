import rm.controller.*
import rm.domain.*
import rm.repository.*
import rm.service.*

description 'User can view a reference entry'

scenario "user can view a reference entry they have just added", {
    given 'a new entry is added'
    when 'user has not navigated further'
    then 'reference entry is displayed to the user'
}

scenario "user can not view any references when there are none", {
    given 'there are no references in the database'
    when 'user attempts to view an entry'
    then 'no reference entry is displayed'
}

