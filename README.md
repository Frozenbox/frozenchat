# FrozenChat

The ultimate secure communication gateway

## Origins

FrozenChat is a FORK of "Conversations", an awesome XMPP client for android with great features.

We decided to fork it "just for fun", in order to provide a powerful and personalized
android client for our XMPP server (chat.frozenbox.org)

## Design principles

* Be as beautiful and easy to use as possible without sacrificing security or
  privacy
* Rely on existing, well established protocols (XMPP)
* Do not require a Google Account or specifically Google Cloud Messaging (GCM)
* Require as few permissions as possible


## Features

* End-to-end encryption with either [OTR](https://otr.cypherpunks.ca/) or [OpenPGP](http://www.openpgp.org/about_openpgp/)
* Sending and receiving images
* Indication when your contact has read your message
* Intuitive UI that follows Android Design guidelines
* Pictures / Avatars for your Contacts
* Syncs with desktop client
* Conferences (with support for bookmarks)
* Address book integration
* Multiple accounts / unified inbox
* Very low impact on battery life


### XMPP Features

Frozenchat works with every XMPP server out there. However XMPP is an
extensible protocol. These extensions are standardized as well in so called
XEP's. Frozenchat supports a couple of these to make the overall user
experience better. There is a chance that your current XMPP server does not
support these extensions; therefore to get the most out of Frozenchat you
should consider either switching to an XMPP server that does or — even better —
run your own XMPP server for you and your friends. These XEP's are:

* XEP-0065: SOCKS5 Bytestreams (or mod_proxy65). Will be used to transfer
  files if both parties are behind a firewall (NAT).
* XEP-0163: Personal Eventing Protocol for avatars
* XEP-0198: Stream Management allows XMPP to survive small network outages and
  changes of the underlying TCP connection.
* XEP-0280: Message Carbons which automatically syncs the messages you send to
  your desktop client and thus allows you to switch seamlessly from your mobile
  client to your desktop client and back within one conversation.
* XEP-0237: Roster Versioning mainly to save bandwidth on poor mobile connections
* XEP-0313: Message Archive Management synchronize message history with the
  server. Catch up with messages that were sent while Frozenchat was
  offline.
* XEP-0352: Client State Indication lets the server know whether or not
  Frozenchat is in the background. Allows the server to save bandwidth by
  withholding unimportant packages.
* XEP-0191: Blocking command lets you blacklist spammers or block contacts
  without removing them from your roster.



## Team

### FrozenChat Developers

* Lorenzo "EclipseSpark" Faletra

* Davide TheZero

* Frozenbox Dev Team



### Original "Conversations" Developers

#### Head of Development

* [Daniel Gultsch](https://github.com/inputmice)

#### Code Contributions

(In order of appearance)

* [Rene Treffer](https://github.com/rtreffer)
* [Andreas Straub](https://github.com/strb)
* [Alethea Butler](https://github.com/alethea)
* [M. Dietrich](https://github.com/emdete)
* [betheg](https://github.com/betheg)
* [Sam Whited](https://github.com/SamWhited)

#### Logo
* [Ilia Rostovtsev](https://github.com/qooob) (Progress)
* [Diego Turtulici](http://efesto.eigenlab.org/~diesys) (Original)

#### Translations
Translations are managed on [Transifex](https://www.transifex.com/projects/p/conversations/)

## FAQ

### General

#### How do I install FrozenChat?


FrozenChat can be downloaded from the main page of our chat services (http://chat.frozenbox.org)

FrozenChat is entirely open source and licensed under GPLv3. So if you are a
software developer you can check out the sources from GitHub and use ant to
build your apk file.

Building instructions are available in the end of this readme file.


REMEMBER that FrozenChat is a fork of the original Conversations XMPP client developed by SIACS
that offers its source code for free (as in freedom) and in order to finance their project
they decided to offer the official client on Google Play Store with a little fee.
So you'reinvited to try also the original version of the software and contribute
with a little donation, or if you want to donate without buy the app
feel free to make a free donation to the team.
THEY DESERVE THAT DAMN COFFEE!!

[Play Store](https://play.google.com/store/apps/details?id=eu.siacs.convesations).


They accept donations over PayPal, Bitcoin and Flattr. For donations via PayPal you
can use the email address `donate@siacs.eu` or the button below.

[![Donate with PayPal](https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CW3SYT3KG5PDL)

**Disclaimer:** The team is not a huge fan of PayPal and their business policies. For
larger contributions please get in touch with them beforehand in order to talk
about bank transfer (SEPA) directly with the original software developer.

Their Bitcoin Address is: `1NxSU1YxYzJVDpX1rcESAA3NJki7kRgeeu`




#### How do I create an account?

We started this project in order to provide an official client for our XMPP
server, so you're welcome on our server :) just register a new user on chat.frozenbox.org
by typing your username followed by "chat.frozenbox.org" like an
email address (myuser@chat.frozenbox.org), then select the related option to create a new user on that server
and enter the desired password twice to create a new user.

BUT REMEMBER: feel free to use any server you want, not only the Frozenbox one,
you are free to contact any user registered in any xmpp server in any case, whatever server you're registered at.

XMPP, like email, is a federated protocol which means that there is not one
company you can create an 'official XMPP account' with. Instead there are
hundreds, or even thousands, of provider out there. To find one use a web search
engine of your choice. Or maybe your university has one. Or you can run your
own. Or ask a friend to run one. Once you've found one, you can use
Frozenchat to create an account. Just select 'register new account on server'
within the create account dialog.




#### Frozenchat doesn't work for me. Where can I get help?

You can join our conference room on
[welcome@conference.chat.frozenbox.org](xmpp:welcome@conference.chat.frozenbox.org?join)
A lot of people in there are able to answer basic questions about the usage of
Frozenchat or can provide you with tips on running your own XMPP server. If
you found a bug or your app crashes please read the Developer / Report Bugs
section of this document.



#### I need professional support with FrozenChat or setting up my server

Feel free to contact us on the server itself or by email `chat@frozenbox.org`

Or feel free to hire the original "Conversations" developer at `inputmice@siacs.eu`.



#### How does the address book integration work?

The address book integration was designed to protect your privacy. Frozenchat
neither uploads contacts from your address book to your server nor fills your
address book with unnecessary contacts from your online roster. If you manually
add a Jabber ID to your phones address book Frozenchat will use the name and
the profile picture of this contact. To make the process of adding Jabber IDs to
your address book easier you can click on the profile picture in the contact
details within Frozenchat. This will start an "add to address book" intent
with the JID as the payload. This doesn't require Frozenchat to have write
permissions on your address book but also doesn't require you to copy/paste a
JID from one app to another.



#### I get 'delivery failed' on my messages

If you get delivery failed on images it's probably because the recipient lost
network connectivity during reception. In that case you can try it again at a
later time.

For text messages the answer to your question is a little bit more complex.
When you see 'delivery failed' on text messages, it is always something that is
being reported by the server. The most common reason for this is that the
recipient failed to resume a connection. When a client loses connectivity for a
short time the client usually has a five minute window to pick up that
connection again. When the client fails to do so because the network
connectivity is out for longer than that all messages sent to that client will
be returned to the sender resulting in a delivery failed.

Other less common reasons are that the message you sent didn't meet some
criteria enforced by the server (too large, too many). Another reason could be
that the recipient is offline and the server doesn't provide offline storage.

Usually you are able to distinguish between these two groups in the fact that
the first one happens always after some time and the second one happens almost
instantly.





#### Where can I see the status of my contacts? How can I set a status or priority?

Statuses are a horrible metric. Setting them manually to a proper value rarely
works because users are either lazy or just forget about them. Setting them
automatically does not provide quality results either. Keyboard or mouse
activity as indicator for example fails when the user is just looking at
something (reading an article, watching a movie). Furthermore automatic setting
of status always implies an impact on your privacy (are you sure you want
everybody in your contact list to know that you have been using your computer at
4am‽).

In the past status has been used to judge the likelihood of whether or not your
messages are being read. This is no longer necessary. With Chat Markers
(XEP-0333, supported by Frozenchat since 0.4) we have the ability to **know**
whether or not your messages are being read.  Similar things can be said for
priorities. In the past priorities have been used (by servers, not by clients!)
to route your messages to one specific client. With carbon messages (XEP-0280,
supported by Frozenchat since 0.1) this is no longer necessary. Using
priorities to route OTR messages isn't practical either because they are not
changeable on the fly. Metrics like last active client (the client which sent
the last message) are much better.

Unfortunately these modern replacements for legacy XMPP features are not widely
adopted. However Frozenchat should be an instant messenger for the future and
instead of making Frozenchat compatible with the past we should work on
implementing new, improved technologies and getting them into other XMPP clients
as well.

Making these status and priority optional isn't a solution either because
Frozenchat is trying to get rid of old behaviours and set an example for
other clients.





#### Frozenchat is missing a certain feature

I'm open for new feature suggestions. Contact us via email at `chat@frozenbox.org`.

But i also suggest to contact the original "Conversations" project, they have
a well managed tracking system on their GitHub page.




### Security

#### Why are there two end-to-end encryption methods and which one should I choose?

In most cases OTR should be the encryption method of choice. It works out of the
box with most contacts as long as they are online. However PGP can, in some
cases, (message carbons to multiple clients) be more flexible.

#### How do I use OpenPGP

Before you continue reading you should note that the OpenPGP support in
Frozenchat is experimental. This is not because it will make the app unstable
but because the fundamental concepts of PGP aren't ready for widespread use.
The way PGP works is that you trust Key IDs instead of JID's or email addresses.
So in theory your contact list should consist of Public-Key-IDs instead of
JID's. But of course no email or XMPP client out there implements these
concepts. Plus PGP in the context of instant messaging has a couple of
downsides: It is vulnerable to replay attacks, it is rather verbose, and
decrypting and encrypting takes longer than OTR. It is however asynchronous and
works well with message carbons.

To use OpenPGP you have to install the open source app
[OpenKeychain](www.openkeychain.org) and then long press on the account in
manage accounts and choose renew PGP announcement from the contextual menu.



#### How does the encryption for conferences work?

For conferences the only supported encryption method is OpenPGP (OTR does not
work with multiple participants). Every participant has to announce their
OpenPGP key (see answer above). If you would like to send encrypted messages to
a conference you have to make sure that you have every participant's public key
in your OpenKeychain. Right now there is no check in Frozenchat to ensure
that. You have to take care of that yourself. Go to the conference details and
touch every key id (The hexadecimal number below a contact). This will send you
to OpenKeychain which will assist you on adding the key.  This works best in
very small conferences with contacts you are already using OpenPGP with. This
feature is regarded experimental. Frozenchat is the only client that uses
XEP-0027 with conferences. (The XEP neither specifically allows nor disallows
this.)





### Development

#### How do I build Frozenchat

Install the Android-SDK on your operating system (we use debian or parrot)

Install possible missing libraries/modules/packages

Make sure to have ANDROID_HOME point to your Android SDK
	usually it is located at /usr/share/android-sdk


Then fetch and build the source code

    git clone https://github.com/frozenbox/frozenchat.git
    cd Frozenchat
    ./gradlew build



### How do I update/add external libraries?

If the library you want to update is in Maven Central or JCenter (or has its own
Maven repo), add it or update its version in `build.gradle`. If the library is
in the `libs/` directory, you can update it using a subtree merge by doing the
following (using `minidns` as an example):

    git remote add minidns https://github.com/rtreffer/minidns.git
    git fetch minidns
    git merge -s subtree minidns master

To add a new dependency to the `libs/` directory (replacing "name", "branch" and
"url" as necessary):

    git remote add name url
    git merge -s ours --no-commit name/branch
    git read-tree --prefix=libs/name -u name/branch
    git commit -m "Subtree merged in name"

#### How do I debug Frozenchat

If something goes wrong Frozenchat usually exposes very little information in
the UI (other than the fact that something didn't work). However with adb
(android debug bridge) you squeeze some more information out of Frozenchat.
These information are especially useful if you are experiencing trouble with
your connection or with file transfer.

    adb -d logcat -v time -s frozenchat

#### I found a bug

Please report it to our [issue tracker][issues]. If your app crashes please
provide a stack trace. If you are experiencing misbehaviour please provide
detailed steps to reproduce. Always mention whether you are running the latest
Play Store version or the current HEAD. If you are having problems connecting to
your XMPP server your file transfer doesn’t work as expected please always
include a logcat debug output with your issue (see above).

[issues]: https://github.com/frozenbox/frozenchat/issues
