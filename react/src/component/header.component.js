import React, {Component} from "react";
import {Navbar, NavItem} from 'react-materialize'
export default class Header extends Component {

    constructor(props) {
        super(props)
    }

    render() {
        return (
            <Navbar brand='logo' right className={'indigo darken-2'}>
                <NavItem href=''>Home</NavItem>
            </Navbar>
        )
    }
}