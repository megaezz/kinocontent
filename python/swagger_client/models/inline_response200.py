# coding: utf-8

"""
    Киноконтент API

    REST API биржи описаний к фильмам и сериалам https://kinocontent.club  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class InlineResponse200(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'id': 'int',
        'kinopoisk_id': 'int',
        'text': 'str',
        'text_length': 'int',
        'symbols_from': 'int',
        'symbols_to': 'int',
        'unique': 'int',
        'comment': 'str',
        'private_comment': 'str',
        'confirmed': 'bool',
        'express': 'bool',
        'archived': 'bool',
        'moderated': 'bool',
        'rework': 'bool',
        'rework_comment': 'str'
    }

    attribute_map = {
        'id': 'id',
        'kinopoisk_id': 'kinopoisk_id',
        'text': 'text',
        'text_length': 'text_length',
        'symbols_from': 'symbols_from',
        'symbols_to': 'symbols_to',
        'unique': 'unique',
        'comment': 'comment',
        'private_comment': 'private_comment',
        'confirmed': 'confirmed',
        'express': 'express',
        'archived': 'archived',
        'moderated': 'moderated',
        'rework': 'rework',
        'rework_comment': 'rework_comment'
    }

    def __init__(self, id=None, kinopoisk_id=None, text=None, text_length=None, symbols_from=None, symbols_to=None, unique=None, comment=None, private_comment=None, confirmed=None, express=None, archived=None, moderated=None, rework=None, rework_comment=None):  # noqa: E501
        """InlineResponse200 - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._kinopoisk_id = None
        self._text = None
        self._text_length = None
        self._symbols_from = None
        self._symbols_to = None
        self._unique = None
        self._comment = None
        self._private_comment = None
        self._confirmed = None
        self._express = None
        self._archived = None
        self._moderated = None
        self._rework = None
        self._rework_comment = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if kinopoisk_id is not None:
            self.kinopoisk_id = kinopoisk_id
        if text is not None:
            self.text = text
        if text_length is not None:
            self.text_length = text_length
        if symbols_from is not None:
            self.symbols_from = symbols_from
        if symbols_to is not None:
            self.symbols_to = symbols_to
        if unique is not None:
            self.unique = unique
        if comment is not None:
            self.comment = comment
        if private_comment is not None:
            self.private_comment = private_comment
        if confirmed is not None:
            self.confirmed = confirmed
        if express is not None:
            self.express = express
        if archived is not None:
            self.archived = archived
        if moderated is not None:
            self.moderated = moderated
        if rework is not None:
            self.rework = rework
        if rework_comment is not None:
            self.rework_comment = rework_comment

    @property
    def id(self):
        """Gets the id of this InlineResponse200.  # noqa: E501


        :return: The id of this InlineResponse200.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this InlineResponse200.


        :param id: The id of this InlineResponse200.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def kinopoisk_id(self):
        """Gets the kinopoisk_id of this InlineResponse200.  # noqa: E501


        :return: The kinopoisk_id of this InlineResponse200.  # noqa: E501
        :rtype: int
        """
        return self._kinopoisk_id

    @kinopoisk_id.setter
    def kinopoisk_id(self, kinopoisk_id):
        """Sets the kinopoisk_id of this InlineResponse200.


        :param kinopoisk_id: The kinopoisk_id of this InlineResponse200.  # noqa: E501
        :type: int
        """

        self._kinopoisk_id = kinopoisk_id

    @property
    def text(self):
        """Gets the text of this InlineResponse200.  # noqa: E501


        :return: The text of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this InlineResponse200.


        :param text: The text of this InlineResponse200.  # noqa: E501
        :type: str
        """

        self._text = text

    @property
    def text_length(self):
        """Gets the text_length of this InlineResponse200.  # noqa: E501


        :return: The text_length of this InlineResponse200.  # noqa: E501
        :rtype: int
        """
        return self._text_length

    @text_length.setter
    def text_length(self, text_length):
        """Sets the text_length of this InlineResponse200.


        :param text_length: The text_length of this InlineResponse200.  # noqa: E501
        :type: int
        """

        self._text_length = text_length

    @property
    def symbols_from(self):
        """Gets the symbols_from of this InlineResponse200.  # noqa: E501


        :return: The symbols_from of this InlineResponse200.  # noqa: E501
        :rtype: int
        """
        return self._symbols_from

    @symbols_from.setter
    def symbols_from(self, symbols_from):
        """Sets the symbols_from of this InlineResponse200.


        :param symbols_from: The symbols_from of this InlineResponse200.  # noqa: E501
        :type: int
        """

        self._symbols_from = symbols_from

    @property
    def symbols_to(self):
        """Gets the symbols_to of this InlineResponse200.  # noqa: E501


        :return: The symbols_to of this InlineResponse200.  # noqa: E501
        :rtype: int
        """
        return self._symbols_to

    @symbols_to.setter
    def symbols_to(self, symbols_to):
        """Sets the symbols_to of this InlineResponse200.


        :param symbols_to: The symbols_to of this InlineResponse200.  # noqa: E501
        :type: int
        """

        self._symbols_to = symbols_to

    @property
    def unique(self):
        """Gets the unique of this InlineResponse200.  # noqa: E501


        :return: The unique of this InlineResponse200.  # noqa: E501
        :rtype: int
        """
        return self._unique

    @unique.setter
    def unique(self, unique):
        """Sets the unique of this InlineResponse200.


        :param unique: The unique of this InlineResponse200.  # noqa: E501
        :type: int
        """

        self._unique = unique

    @property
    def comment(self):
        """Gets the comment of this InlineResponse200.  # noqa: E501


        :return: The comment of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """Sets the comment of this InlineResponse200.


        :param comment: The comment of this InlineResponse200.  # noqa: E501
        :type: str
        """

        self._comment = comment

    @property
    def private_comment(self):
        """Gets the private_comment of this InlineResponse200.  # noqa: E501


        :return: The private_comment of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._private_comment

    @private_comment.setter
    def private_comment(self, private_comment):
        """Sets the private_comment of this InlineResponse200.


        :param private_comment: The private_comment of this InlineResponse200.  # noqa: E501
        :type: str
        """

        self._private_comment = private_comment

    @property
    def confirmed(self):
        """Gets the confirmed of this InlineResponse200.  # noqa: E501


        :return: The confirmed of this InlineResponse200.  # noqa: E501
        :rtype: bool
        """
        return self._confirmed

    @confirmed.setter
    def confirmed(self, confirmed):
        """Sets the confirmed of this InlineResponse200.


        :param confirmed: The confirmed of this InlineResponse200.  # noqa: E501
        :type: bool
        """

        self._confirmed = confirmed

    @property
    def express(self):
        """Gets the express of this InlineResponse200.  # noqa: E501


        :return: The express of this InlineResponse200.  # noqa: E501
        :rtype: bool
        """
        return self._express

    @express.setter
    def express(self, express):
        """Sets the express of this InlineResponse200.


        :param express: The express of this InlineResponse200.  # noqa: E501
        :type: bool
        """

        self._express = express

    @property
    def archived(self):
        """Gets the archived of this InlineResponse200.  # noqa: E501


        :return: The archived of this InlineResponse200.  # noqa: E501
        :rtype: bool
        """
        return self._archived

    @archived.setter
    def archived(self, archived):
        """Sets the archived of this InlineResponse200.


        :param archived: The archived of this InlineResponse200.  # noqa: E501
        :type: bool
        """

        self._archived = archived

    @property
    def moderated(self):
        """Gets the moderated of this InlineResponse200.  # noqa: E501


        :return: The moderated of this InlineResponse200.  # noqa: E501
        :rtype: bool
        """
        return self._moderated

    @moderated.setter
    def moderated(self, moderated):
        """Sets the moderated of this InlineResponse200.


        :param moderated: The moderated of this InlineResponse200.  # noqa: E501
        :type: bool
        """

        self._moderated = moderated

    @property
    def rework(self):
        """Gets the rework of this InlineResponse200.  # noqa: E501


        :return: The rework of this InlineResponse200.  # noqa: E501
        :rtype: bool
        """
        return self._rework

    @rework.setter
    def rework(self, rework):
        """Sets the rework of this InlineResponse200.


        :param rework: The rework of this InlineResponse200.  # noqa: E501
        :type: bool
        """

        self._rework = rework

    @property
    def rework_comment(self):
        """Gets the rework_comment of this InlineResponse200.  # noqa: E501


        :return: The rework_comment of this InlineResponse200.  # noqa: E501
        :rtype: str
        """
        return self._rework_comment

    @rework_comment.setter
    def rework_comment(self, rework_comment):
        """Sets the rework_comment of this InlineResponse200.


        :param rework_comment: The rework_comment of this InlineResponse200.  # noqa: E501
        :type: str
        """

        self._rework_comment = rework_comment

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(InlineResponse200, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, InlineResponse200):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other