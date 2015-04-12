import rm.controller.*
import rm.domain.*
import rm.repository.*
import rm.service.*

description 'User can add a valid reference entry to the database'

scenario "user can add a reference when content is appropriate", {
    given 'command new entry is selected'
    when 'mandatory fields are filled'
    and 'content is valid'
    then 'reference entry will be added to the database'
}

scenario "user can not add a reference with inadequate information", {
    given 'command new entry is selected'
    when 'content is valid'
    and 'mandatory fields are not filled'
    then 'reference entry will not be added to the database'
}

scenario "user can not add a reference with invalid information", {
    given 'command new entry is selected'
    when 'content is not valid'
    and 'mandatory fields are filled'
    then 'reference entry will not be added to the database'
}
